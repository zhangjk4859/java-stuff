package com.kago.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by kevin on 2017/1/29.
 */
public class JasonToExcel {

    public static void main(String[] args) {

        //1.从本地读取JSON文件


        String fullFileName = "/Users/kevin/Desktop/jsonData.json";

        File file = new File(fullFileName);
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        String data = buffer.toString();
        //System.out.println(buffer.toString());







        // 数据的格式如下：data对应JSONArray
        //        String data = "{'data': [{'姓名':'张三', '年龄':'20', '性别':'男'}, {'姓名':'李四', '年龄':'21', '性别':'女'}, {'姓名':'王五', '年龄':'22', '性别':'男'}]}";
            //        String data = "";

        // 2.将String的data转换为JSONObject对象jsonObject
        JSONObject jsonObject = JSONObject.fromObject(data);


        //3.设置保存路径
        JSONObject result = Excel.createExcel("/Users/kevin/Desktop/a.xls", jsonObject);
        //4.输出结果
        System.out.println(result);
    }

}

class Excel {
    @SuppressWarnings("unchecked")
    // 创建excel文件函数
    // src为待保存的文件路径,json为待保存的json数据
    public static JSONObject createExcel(String src, JSONObject json) {
        JSONObject result = new JSONObject(); // 用来反馈函数调用结果
        try {
            // 新建文件
            File file = new File(src);
            file.createNewFile();

            OutputStream outputStream = new FileOutputStream(file);// 创建工作薄
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(outputStream);
            WritableSheet sheet = writableWorkbook.createSheet("First sheet", 0);// 创建新的一页

            JSONArray jsonArray = json.getJSONArray("data");// 得到data对应的JSONArray
            Label label; // 单元格对象
            int column = 0; // 列数计数

            // 将第一行信息加到页中。如：姓名、年龄、性别
            JSONObject first = jsonArray.getJSONObject(0);
            Iterator<String> iterator = first.keys(); // 得到第一项的key集合
            while (iterator.hasNext()) { // 遍历key集合
                String key = (String) iterator.next(); // 得到key
                label = new Label(column++, 0, key); // 第一个参数是单元格所在列,第二个参数是单元格所在行,第三个参数是值
                sheet.addCell(label); // 将单元格加到页
            }

            // 遍历jsonArray
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject item = jsonArray.getJSONObject(i); // 得到数组的每项
                iterator = item.keys(); // 得到key集合
                column = 0;// 从第0列开始放
                while (iterator.hasNext()) {
                    String key = iterator.next(); // 得到key
                    String value = item.getString(key); // 得到key对应的value
                    label = new Label(column++, (i + 1), value); // 第一个参数是单元格所在列,第二个参数是单元格所在行,第三个参数是值
                    sheet.addCell(label); // 将单元格加到页
                }
            }
            writableWorkbook.write(); // 加入到文件中
            writableWorkbook.close(); // 关闭文件，释放资源
        } catch (Exception e) {
            result.put("result", "failed"); // 将调用该函数的结果返回
            result.put("reason", e.getMessage()); // 将调用该函数失败的原因返回
            return result;
        }

        result.put("result", "successed");
        return result;
    }
}

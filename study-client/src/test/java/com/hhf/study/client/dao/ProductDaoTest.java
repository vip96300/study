package com.hhf.study.client.dao;

import com.hhf.study.client.dao.ProductDao;
import com.hhf.study.client.entity.ProductEntity;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 16:34 2018/4/4
 */
public class ProductDaoTest{

    @Autowired
    private ProductDao productDao;

    //@Test
    public void add(){
        HSSFWorkbook wb = null;
        try {//简数
            wb = new HSSFWorkbook(new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\data.xls")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HSSFSheet sheet = wb.getSheetAt(0);
        for(int r=1;r<sheet.getLastRowNum();r++){
            HSSFRow row = sheet.getRow(r);
            for(int c=0;c<row.getLastCellNum();c++){
                HSSFCell cell = row.getCell(c);
                System.err.println(cell.getStringCellValue());
            }
            ProductEntity product=new ProductEntity();
            product.setShopid(1L);//
            product.setCategoryid(161L);
            product.setCategorypath("17|160|161");
            product.setTypeid(86L);
            product.setBrandid(0L);//
            product.setProductname(row.getCell(9).getStringCellValue());//
            product.setProductcode(row.getCell(2).getStringCellValue());//
            product.setShortdescription(row.getCell(9).getStringCellValue());//
            product.setSalestatus(1);//
            product.setAuditstatus(2);//
            product.setAddeddate(new Date());//
            product.setDisplaysequence(1L);//
            product.setMarketprice(Double.parseDouble(row.getCell(10).getStringCellValue()));//
            product.setMinsaleprice(Double.parseDouble(row.getCell(10).getStringCellValue())-10);//
            product.setHassku(false);//
            product.setVisticounts(0L);//
            product.setSalecounts(Long.valueOf(row.getCell(0).getStringCellValue()));//
            product.setFreighttemplateid(166L);//
            product.setWeight(0D);//
            product.setVolume(0D);//
            product.setQuantity(0);//
            product.setMeasureunit("L");
            product.setEditstatus(0);//
            product.setIsdeleted(false);//
            product.setMaxbuycount(0);//
            product.setIsspecialbuy(false);//
            product.setIsrecommend(false);//
            //productDao.save(product);
            //TODO 下载图片，上传至服务器
            product.setImagepath("http://huiteji.oss-cn-hangzhou.aliyuncs.com/Storage/Shop/1/Products/"+product.getId());
            //productDao.saveAndFlush(product);
        }

    }

}

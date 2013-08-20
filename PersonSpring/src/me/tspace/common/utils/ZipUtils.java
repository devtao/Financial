package me.tspace.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Zip Helper.
 * @author admin
 *
 */
public class ZipUtils {
	
	/**
	 * 
	 * @param srcPath -- 需要被打包的目录路径 --e.g:D:/ziptest/test
	 * @param zipPath -- ZIP的生成路径  -- e.g:D:/ziptest/test.zip
	 * @param targetPath --ZIP的存放路径 -- e.g:D:/ziptest
	 */
	public static void toZipFile(String srcPath,String zipPath,String targetPath) throws Exception{
		  File srcCategory = new File(srcPath);
	      ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath));
	      packFile(srcCategory, zos, "");
	      zos.close();
	}
	
    public static void packFile(File inFile, ZipOutputStream zos, String dir) throws IOException {
        if (inFile.isDirectory()) {
            File[] files = inFile.listFiles();
            for (File file:files)
            	packFile(file, zos, dir + "\\" + inFile.getName());
        } else {
            String entryName = null;
            if (!"".equals(dir))
                entryName = dir + "\\" + inFile.getName();
            else
                entryName = inFile.getName();
            if(entryName.startsWith("\\"))
            	entryName = entryName.substring(1,entryName.length());
            ZipEntry entry = new ZipEntry(entryName);
            zos.putNextEntry(entry);
            InputStream is = new FileInputStream(inFile);
            int len = 0;
            while ((len = is.read()) != -1)
                zos.write(len);
            is.close();
        }
 
    }
}

/**
* @Title: MD5.java
* @Package com.clps.kevin.sms.utils
* @Description: TODO(用一句话描述该文件做什么)
* @author Kevin
* @date 2017年8月9日
* @version V1.0
*/
package com.clps.kevin.sms.utils;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
* @ClassName: MD5
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Kevin
* @date 2017年8月9日
*
*/
public class MD5 {

    /**
    * @Fields strDigits : TODO(定义全局数组)
    */
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    /**
    * 创建一个新的实例 MD5.
    * 无参构造方法
    */
    public MD5() {
    }

    /**
    * @Title: byteToArrayString
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param bByte
    * @return    返回形式为数字跟字符串
    * @return String    返回类型
    * @throws
    */
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    /**
    * @Title: byteToNum
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param bByte
    * @return    返回形式只为数字
    * @return String    返回类型
    * @throws
    */
    private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    /**
    * @Title: byteToString
    * @Description: TODO(转换字节数组为16进制字串)
    * @param bByte
    * @return    参数
    * @return String    返回类型
    * @throws
    */
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    /**
    * @Title: GetMD5Code
    * @Description: TODO(通过调用此方法，获取加密后字符串)
    * @param strObj
    * @return    参数
    * @return String    返回类型
    * @throws
    */
    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

    public static void main(String[] args) {
        MD5 getMD5 = new MD5();
        System.out.println(getMD5.GetMD5Code("123456"));
    }
}

/**
* @Title: TestLog4j.java
* @Package sms
* @Description: TODO(用一句话描述该文件做什么)
* @author Kevin
* @date 2017年8月10日
* @version V1.0
*/
package sms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
* @ClassName: TestLog4j
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Kevin
* @date 2017年8月10日
*
*/
public   class  TestLog4j  {
    public   static   void  main(String[] args)  {
       //PropertyConfigurator.configure( " D:/Code/conf/log4j.properties " );
       Logger logger  =  Logger.getLogger(TestLog4j. class );
       logger.debug( " this is debug " );
       logger.error( " this is error " );
   }
} 

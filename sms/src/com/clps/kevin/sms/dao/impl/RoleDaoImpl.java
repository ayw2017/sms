/**
* @Title: RoleDaoImpl.java
* @Package com.clps.kevin.sms.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author Kevin
* @date 2017年8月9日
* @version V1.0
*/
package com.clps.kevin.sms.dao.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.clps.kevin.sms.dao.RoleDao;
import com.clps.kevin.sms.model.Role;

/**
* @ClassName: RoleDaoImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Kevin
* @date 2017年8月9日
*
*/
public class RoleDaoImpl implements RoleDao {

	/**
	* @Title: main
	* @Description: TODO(主函数输出)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
			/**
			 * 第一层对象
			 */
			Role role=new Role();
			role.setRole_Name("最高层HR");
			/**
			 * 第二层对象
			 */
			Role role1=new Role();
			role.setRole_Name("第二层");
			Role role2=new Role();
			role.setRole_Name("第二层");
			
			
			Set<Role> thirdOut=new HashSet<>();
			Map<Integer,Set<Role>> secondOut=new HashMap<>();
			secondOut.put(1, thirdOut);
			Set<Map<Integer, Set<Role>>> firstOut=new HashSet();
			
			firstOut.add(secondOut);
			
			
			/**
			 * Map.Entry遍历
			 */
			
			
		}
}

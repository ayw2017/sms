/**
* @Title: Role.java
* @Package com.clps.kevin.sms.model
* @Description: TODO(用一句话描述该文件做什么)
* @author Kevin
* @date Aug 8, 2017
* @version V1.0
*/
package com.clps.kevin.sms.model;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: Role
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Kevin
* @date Aug 8, 2017
*
*/
public class Role implements Serializable {
	
	/**
	* @Fields role_Id : TODO(定义角色id)
	*/
	private int role_Id;
	/**
	* @Fields role_Name : TODO(定义角色名称)
	*/
	private String role_Name;
	/**
	* @Fields role_Desc : TODO(定义角色描述)
	*/
	private String role_Desc;
	/**
	* @Fields role_Super_Id : TODO(定义角色父节点)
	*/
	private String role_Super_Id;
	/**
	* @Fields create_Name : TODO(定义角色创建人名)
	*/
	private String role_Create_Name;
	
	/**
	* @Fields role_Create_Date : TODO(定义角色创建时间)
	*/
	private Date role_Create_Date;
	/**
	* @Fields update_Name : TODO(定义角色修改人名)
	*/
	private String role_update_Name;
	/**
	* @Fields role_Update_Date : TODO(定义角色修改时间)
	*/
	private Date role_Update_Date;
	/**
	* @Fields role_status : TODO(定义角色状态)
	*/
	private int role_status;
	
	
	
	
	/**
	* 创建一个新的实例 Role.
	* 无参构造方法
	*/
	public Role() {
		super();
	}




	/**
	 * @return the role_Id
	 */
	public final int getRole_Id() {
		return role_Id;
	}




	/**
	 * @param role_Id the role_Id to set
	 */
	public final void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}




	/**
	 * @return the role_Name
	 */
	public final String getRole_Name() {
		return role_Name;
	}




	/**
	 * @param role_Name the role_Name to set
	 */
	public final void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}




	/**
	 * @return the role_Desc
	 */
	public final String getRole_Desc() {
		return role_Desc;
	}




	/**
	 * @param role_Desc the role_Desc to set
	 */
	public final void setRole_Desc(String role_Desc) {
		this.role_Desc = role_Desc;
	}




	/**
	 * @return the role_Super_Id
	 */
	public final String getRole_Super_Id() {
		return role_Super_Id;
	}




	/**
	 * @param role_Super_Id the role_Super_Id to set
	 */
	public final void setRole_Super_Id(String role_Super_Id) {
		this.role_Super_Id = role_Super_Id;
	}




	/**
	 * @return the role_Create_Name
	 */
	public final String getRole_Create_Name() {
		return role_Create_Name;
	}




	/**
	 * @param role_Create_Name the role_Create_Name to set
	 */
	public final void setRole_Create_Name(String role_Create_Name) {
		this.role_Create_Name = role_Create_Name;
	}




	/**
	 * @return the role_Create_Date
	 */
	public final Date getRole_Create_Date() {
		return role_Create_Date;
	}




	/**
	 * @param role_Create_Date the role_Create_Date to set
	 */
	public final void setRole_Create_Date(Date role_Create_Date) {
		this.role_Create_Date = role_Create_Date;
	}




	/**
	 * @return the role_update_Name
	 */
	public final String getRole_update_Name() {
		return role_update_Name;
	}




	/**
	 * @param role_update_Name the role_update_Name to set
	 */
	public final void setRole_update_Name(String role_update_Name) {
		this.role_update_Name = role_update_Name;
	}




	/**
	 * @return the role_Update_Date
	 */
	public final Date getRole_Update_Date() {
		return role_Update_Date;
	}




	/**
	 * @param role_Update_Date the role_Update_Date to set
	 */
	public final void setRole_Update_Date(Date role_Update_Date) {
		this.role_Update_Date = role_Update_Date;
	}




	/**
	 * @return the role_status
	 */
	public final int getRole_status() {
		return role_status;
	}




	/**
	 * @param role_status the role_status to set
	 */
	public final void setRole_status(int role_status) {
		this.role_status = role_status;
	}
	
	
	
	
	
	
	

}

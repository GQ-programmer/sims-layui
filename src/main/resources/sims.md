# 数据库建表

- 宿舍管理
  - 宿舍列表
  - 维修登记
- 卫生管理
  - 宿舍卫生
  - 班级卫生
- 访客管理
  - 访客列表
- 管理员信息
  - 管理员列表
- 日志管理
  - 日志列表



****

**宿舍列表（s_dormitory）dorm_list.html**

d_id  						int								唯一标识	自增

d_dormbuilding    varchar（50）			宿舍楼号

d_dormitoryid		varchar（50）			宿舍编号

d_bedtotal			int									床位总数

d_bed					int 									已用床位

d_dormitoryhead  vachar(50)					宿舍长姓名

d_phone				varchar(50)					宿舍长电话

d_dormitorycategory 	varchar(5)			宿舍类别（男寝or 女寝）

****

**维修登记（s_dormRepair）dorm_repair.html**

r_id					int 										唯一标识	自增

d_dormbuilding    varchar（50）			宿舍楼号

d_dormitoryid		varchar（50）			宿舍编号

r_name					varchar（50）			维修人员

r_reason					varchar(100)			报修事由

repair_time			varchar（50)				维修时间

****

**宿舍卫生（s_dormgrade）dorm_grade.html**

dg_id					int 										唯一标识	自增

d_dormbuilding    varchar（50）			宿舍楼号

d_dormitoryid		varchar（50）			宿舍编号

dorm_grade				int								宿舍卫生分数（1—10）

update_time			varchar（50）				更新日期

****

**班级卫生（s_classgrade）class_grade.html**

cg_id				int								唯一标识	自增

c_classId  		varchar（50）			班级编号

c_className	varchar（50）			班级名称

class_grade		int								班级分数（1—10）

update_time			varchar（50）				更新日期

****

**访客列表（s_visitor）**

v_id									int								唯一标识	自增

v_name      						varchar（10）			访客姓名

v_phone  						varchar（20）				访客电话

v_dormbuilding 			varchar（20）				访问宿舍楼号

v_dormitoryid 				varchar（10）				访问宿舍编号

create_time					varchar（50）				访问时间		

****



**管理员列表（s_admin）**

  aid  							int								唯一标识		自增

username      			varchar（50)					用户名

name 						varchar（10)					姓名

sex							varchar(10)						性别

tel          						varchar（50)					电话



****



**登录日志（s_log）**

l_id									int								唯一标识	自增

username    				varchar（50)					用户名

name							varchar（10)					姓名

sex							varchar(10)						性别

tel          						varchar（50)					电话

login_time					varchar（50）				登录时间

****





# 前端页面开发

新增的导航栏

- 宿舍管理

  - 宿舍列表
  - 维修登记

- 卫生管理

  - 宿舍卫生
  - 班级卫生

- 访客管理

  - 访客列表

- 管理员信息

  - 管理员列表

- 日志管理

  - 日志列表

  

1. ~~完成导航栏和选项卡的创建√~~
2. 完成每个页面的开发
   1. dorm_list.html

# 前端页面修改顺序 



**table.render({  中的  cols、data**



添加模态框  	 **文本内容		修改属性  ：name、	lay-verify="required"**

修改模态框		**文本内容		修改属性：id、name**

搜索框

![image-20220619184106093](G:\笔记\笔记截图\image-20220619184106093.png)

![image-20220619181821027](G:\笔记\笔记截图\image-20220619181821027.png)

![image-20220619181737400](G:\笔记\笔记截图\image-20220619181737400.png)

![image-20220619181711193](G:\笔记\笔记截图\image-20220619181711193.png)

![image-20220619184415637](G:\笔记\笔记截图\image-20220619184415637.png)

# 后端开发

宿舍列表开始

1. 建表

2. 建实体类

3. 写接口

   1. 写findAll接口  注意拼接条件

   2. 修改搜索框的参数

   3. ![image-20220620180353454](G:\笔记\笔记截图\image-20220620180353454.png)

   4. ![image-20220620175950356](G:\笔记\笔记截图\image-20220620175950356.png)

   5. 

      ![image-20220620114425253](G:\笔记\笔记截图\image-20220620114425253.png)

   6. ![image-20220620114442847](G:\笔记\笔记截图\image-20220620114442847.png)

   7. 添加接口

      ![image-20220620114509624](G:\笔记\笔记截图\image-20220620114509624.png)

   8. 删除接口

      ![image-20220620114538745](G:\笔记\笔记截图\image-20220620114538745.png)

   9. 更新接口

      ![image-20220620114557622](G:\笔记\笔记截图\image-20220620114557622.png)
# SpringSecurityVueLoginDemo

## 一、统一配置
### 1.Vue端口
http://localhost:8080

### 2.SpringBoot端口
http://localhost:8081

### 3.响应码
200：成功
404：找不到资源
403：无权限
401：缺失认证
500：请求失败

### 4.Swagger页面

http://localhost:8081/developer/swagger-ui/index.html



## 二、登录操作

### 1.User登录

用户登录页面(/userLogin)

### 2.Manager登录

可以跳转到管理员登录页面(/managerLogin)



## 三、跨域请求

前端向后端请求数据：

已配置跨域请求，所有向后端请求的数据需要以“/backendServer”开关。

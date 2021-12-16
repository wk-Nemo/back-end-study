## MySQL 服务启动

- 手动在电脑管理中启动
- `cmd`中执行`services.msc`
- `cmd`使用管理员身份打开
  - `net start mysql`：启动`mysql`
  - `net stop mysql`：关闭`mysql`



## MySQL 登录

**`cmd`使用命令连接本地的`mysql`：**

- `mysql -uroot -ppassword `：登录
- `exit`/`quit`：退出



**连接其他`mysql`服务器：**

- `mysql -h127.0.0.1 -uroot -ppassword`：登录
- `exit`/`quit`：推出







​	
## 项目初始化

> [新建一个基于gin框架的项目](https://www.jianshu.com/p/15bc7f1e98fd)



## 项目运行

step1. 运行
```
go run main.go
```

step2. 访问
```
127.0.0.1:8080/ping
```



## GET、POST、PUT、DELETE

```go
package main

import "github.com/gin-gonic/gin"

func main() {
   r := gin.Default()
   r.GET("/path/:id", func(c *gin.Context) {
      id := c.Param("id")
      user := c.DefaultQuery("user", "cy")
      pwd := c.Query("pwd")
      c.JSON(200, gin.H{
         "id": id,
         "user": user,
         "pwd": pwd,
      })
   })
   r.POST("/path", func(c *gin.Context) {
      user := c.DefaultPostForm("user", "cy")
      pwd := c.PostForm("pwd")
      c.JSON(200, gin.H{
         "user": user,
         "pwd": pwd,
      })
   })
   r.DELETE("/path/:id", func(c *gin.Context) {
      id := c.Param("id")
      c.JSON(200, gin.H{
         "id": id,
      })
   })
   r.PUT("/path", func(c *gin.Context) {
      user := c.DefaultPostForm("user", "cy")
      pwd := c.PostForm("pwd")
      c.JSON(200, gin.H{
         "user": user,
         "pwd": pwd,
      })
   })
   r.Run(":1010")
}
```
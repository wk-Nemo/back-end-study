package main

import "github.com/gin-gonic/gin"

type PostParams struct {
	Name string `json:"name" binding:"required"`
	Age int `json:"age" binding:"required"`
	Sex bool `json:"sex" binding:"required"`
}

func main() {
	r := gin.Default()

	r.POST("/testBind", func(c *gin.Context) {
		var p PostParams
		err := c.ShouldBindJSON(&p)

		if err != nil {
			c.JSON(200, gin.H{
				"msg": "error",
				"data": gin.H{},
			})
		} else {
			c.JSON(200, gin.H{
				"msg": "success",
				"data": p,
			})
		}
	})

	r.Run(":8080")
}
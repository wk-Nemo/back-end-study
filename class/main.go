package main

import (
	test "class/testPackage"
	"fmt"
)


func main() {
	// 变量的声明
	var a string = "hello world"
	b := "hello world 2"
	fmt.Println(a)
	fmt.Println(b)

	// 引用包
	fmt.Println(test.A)
}

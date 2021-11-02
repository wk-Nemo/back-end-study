package main

import (
	"class/Interface"
	"fmt"
)


func main() {
	// 变量的声明
	//var a string = "hello world"
	//b := "hello world 2"
	//fmt.Println(a)
	//fmt.Println(b)
	//
	//// 引用包
	//fmt.Println(test.A)
	//
	//// 自执行函数
	//(func() {
	//	fmt.Println("hello world")
	//})()
	//
	//// defer
	//defer def1()
	//fmt.Println("1")
	//fmt.Println("2")
	//defer def2()
	//fmt.Println("3")

	// interface
	Interface.InterTest()
}

func def1() {
	fmt.Println("i am defer1")
}

func def2() {
	fmt.Println("i am defer2")
}


func a(data1 int) {
	fmt.Println(data1)
	b := func(data2 int) {
		fmt.Println(data2)
	}
	b(3)
}


package Interface

import "fmt"

type Animal interface {
	Eat()
	Run()
}

type Cat struct {
	Name string
	Sex bool
}

type Dog struct {
	Name string
}

func (c Cat)Run() {
	fmt.Println(c.Name, "开始跑")
}

func (c Cat)Eat() {
	fmt.Println(c.Name, "开始吃")
}

func (d Dog)Run() {
	fmt.Println(d.Name, "开始跑")
}

func (d Dog)Eat() {
	fmt.Println(d.Name, "开始吃")
}

func InterTest() {
	var a Animal

	c := Cat {
		Name: "Tom",
		Sex: false,
	}

	a = c
	a.Eat()
	a.Run()

	// 接口可以接受所有符合方法定义的类型
	MyRun(c)
	MyRun(Dog{
		Name: "Wolf",
	})
}

func MyRun(a Animal) {
	a.Run()
}
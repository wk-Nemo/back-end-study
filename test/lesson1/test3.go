package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	counts := make(map[string]int)
	input := bufio.NewScanner(os.Stdin)

	for input.Scan() {
		fmt.Printf("%s\n", input.Text())
		counts[input.Text()]++
	}

	for line, n := range counts {
			fmt.Printf("%d %s\n", n, line)
	}
}

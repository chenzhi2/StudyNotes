# Python高阶函数

### filter

- filter()函数用于过滤序列，它接收一个函数和一个序列，filter把传入的函数依次作用于每个元素，然后根据返回值是true/false决定是保留还是舍弃该元素。

- filter函数返回的是一个Iterator，即一个惰性序列,需要用list()函数获得所有结果并返回list

- 用filter求素数

    ```python
    def main():
        for n in primes():
            if n < 1000:
                print(n)
            else:
                break
    
    def _odd_iter():
        n = 1
        while True:
            n = n + 2
            yield n
    
    def _not_divisible(n):
        return lambda x: x % n > 0
    
    def primes():
        yield 2
        it = _odd_iter()
        while True:
            n = next(it)
            yield n
            it = filter(_not_divisible(n), it)
    
    if __name__ == '__main__':
        main()
    ```

    

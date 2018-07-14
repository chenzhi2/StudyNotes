# Python高阶函数

## map/reduce

### map

- map()函数接收两个参数，一个是函数，一个是Iterable,map将传入的函数依次作用到序列上的每个元素，并把结果作为新的Iterator返回

- - ```python
    #高阶函数
    #map
    #reduce
    def f(x):
    	return x*x
    r = map(f,[1,2,3,4,5])
    print(list(r))
    ```

- reduce把一个函数作用在一个序列[x1,x2,....]上，然后把返回的结果和序列中的下一个元素继续做累计运算

  - ```python
    #高阶函数
    #map
    #reduce
    from functools import reduce
    def add(x,y):
    	return x+y
    r = reduce(add,[1,2,3,4,5])
    print(r)
    ```

  


class MinStack:

    def __init__(self):
        self.stack = []
        self.minstack = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        val = min(val, self.minstack[-1] if self.minstack else val)
        self.minstack.append(val)
        

    def pop(self) -> None:
        self.stack.pop()
        self.minstack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minstack[-1]
        
'''
155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

a. MinStack() initializes the stack object.
b. void push(int val) pushes the element val onto the stack.
c. void pop() removes the element on the top of the stack.
d. int top() gets the top element of the stack.
e. int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.
'''
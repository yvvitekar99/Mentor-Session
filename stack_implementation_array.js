

class Stack{
    constructor(){
        this.array=[]
    }
    
    peek(){
        return this.array[this.array.length-1];
    }
    push(value){
        this.array.push(value)
         
    }
    
    pop(){
        const hold=this.array.pop();
        return hold;
    }
}

const stk=new Stack()
stk.push(55)
stk.push(77)
console.log(stk.peek())
console.log(stk)
console.log(stk.pop())

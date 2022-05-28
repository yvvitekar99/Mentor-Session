class Node{
    constructor(value){
        this.value=value;
        this.next=null;
    }
}

class Stack{
    constructor(){
        this.top=null;
        this.bottom=null;
        this.size=0;
    }
    
    peek(){
        return this.top.value;
    }
    push(value){
        const newnode=new Node(value)
        if(this.size==0){
            this.top=newnode;
            this.bottom=newnode;
        }
        else{
            const holding=this.top;
            this.top=newnode;
            this.top.next=holding;
         }
         this.size++
    }
    
    pop(){
        const hold=this.top
        this.top=this.top.next;
        this.size--
        return hold.value;
    }
}

const stk=new Stack()
stk.push(55)
stk.push(77)
console.log(stk.peek())
console.log(stk)
console.log(stk.pop())

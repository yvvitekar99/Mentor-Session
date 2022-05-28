class Node{
    constructor (value){
        this.value=value
        this.next;
        
    }
}

class Queue {
    constructor(){
        this.first=null;
        this.last=null;
        this.length=0;
    }
    peek(){
        return this.first;
    }
    
    enqueu(value){
        const newNode= new Node(value);
        if(this.length==0){
            this.first=newNode;
            this.last=newNode;
        }else{
            this.last.next=newNode;
            this.last=newNode;
        }
        this.length++;
    }
    dequeue(){
        if(this.first==null) return null;
        const hold=this.first;
        if(this.first==this.last) {
            this.last=null;
        }
        this.first=this.first.next;
        this.length--;
        return hold;
    }
}

const myQueue = new Queue();
myQueue.enqueu('JOy');
myQueue.enqueu('kk');
myQueue.enqueu('matt');

console.log(myQueue);
console.log("---------------")

console.log(myQueue.dequeue());
console.log("---------------")
console.log(myQueue);

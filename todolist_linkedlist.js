

class Node{
    constructor(value){
        this.value=value;
        this.next=null;
    }
}

class linkedlist{
    
    constructor(){
        this.head=null
    }
    
    
    addfirst(value){
        const newnode =new Node(value);
        if(this.head==null){
            this.head=newnode;
        }else{
            const hold=this.head;
            this.head=newnode
            this.head.next=hold;
        }
    }
    
    addlast(value){
        const newnode=new Node(value)
        if(this.head==null){
            this.head=newnode;
        }else{
            let temp=this.head;
           while(temp.next!=null){
               temp=temp.next;
           } 
           temp.next=newnode;
           
        }
    }
    
    addindex(value,index){
        const newnode=new Node(value)
        if(this.head==null){head=newnode}
        else{
            let a=1;
            const temp=this.head
            while(a<index){
                temp=temp.next
                a++
                
            }
            temp.next=newnode;
            
        }
    }
    
    removeindex(index){
    
        if(this.head==null){return this.head}
        else{
            let a=1;
            let temp=this.head
            while(a<index){
                temp=temp.next
                a++
                
            }
            const hold=temp;
            temp.next=temp.next.next;
            return temp;
            
        }
    }
    
    removevalue(value){
        if(this.head==null){return null}
        else{
            const temp=this.head
            while(temp.next.value!=value){
                temp=temp.next
            }
            temp.next=temp.next.next
            
        }
    }
    
    print(){
        let temp=this.head
        while(temp!=null){
            console.log(temp.value)
            temp=temp.next
        }
    }
    
    
}


let todolist =new linkedlist


todolist.addfirst(55)
todolist.addlast(554)
todolist.addlast(54)
todolist.addfirst(75)
todolist.removeindex(2)
todolist.print()

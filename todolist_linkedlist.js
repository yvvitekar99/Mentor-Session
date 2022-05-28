

class Node{
    constructor(value){
        this.value=value;
        this.next=null;
    }
}

class linkedlist{
    let head=null;
    constructor(){
        
    }
    
    
    addfirst(value){
        const newnode =new Node(value);
        if(head==null){
            head=newnode;
        }else{
            const hold=head;
            head=newnode
            head.next=hold;
        }
    }
    
    addlast(value){
        const newnode=new Node(value)
        if(head==null){
            head=newnode;
        }else{
            const temp=head;
           while(temp.next!=null){
               temp=temp.next;
           } 
           temp.next=newnode;
           
        }
    }
    
    addindex(value,index){
        const newnode=new Node(value)
        if(head==null){head=newnode}
        else{
            let a=1;
            const temp=head
            while(a<index){
                temp=temp.next
                a++
                
            }
            temp.next=newnode;
            
        }
    }
    
    removeindex(index){
    
        if(head==null){return head}
        else{
            let a=1;
            const temp=head
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
        if(head==null){return null}
        else{
            const temp=head
            while(temp.next.value!=value){
                temp=temp.next
            }
            temp.next=temp.next.next
            
        }
    }
    
    
}


let todolist =new linkedlist

todolist.addfirst(55)
console.log(todolist)

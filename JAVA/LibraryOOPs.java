class Library{
    String[] books;
    int no;
    Library(){
        this.books=new String[100];
        this.no=0;
    }
    void add(String bk){
        this.books[no]=bk;
        no++;
        System.out.println("added book "+this.books[no-1]+" at pos "+(this.no-1) );
    }
    void show(){
        for(String b:this.books){
            if(b==null){continue;}
            System.out.print(b+" ");
        }
    }
    void issue(String bk){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==null){continue;}
            if(this.books[i].equals(bk)){
                System.out.println("issued"+this.books[i]+" which is present at pos "+i);
                this.books[i]=null;
                return;
            }
        }
        System.out.println("book "+bk+" DNE");
    }
    void returning(String bk){
        add(bk);
    }
}

public class LibraryOOPs {
    public static void main(String[] args) {
        Library l=new Library();
        l.add("ab");
        l.add("de");
        l.issue("ab");
        l.add("ff");
        l.returning("ab");
        l.issue("def");
        l.add("tr");
        l.show();
    }
}

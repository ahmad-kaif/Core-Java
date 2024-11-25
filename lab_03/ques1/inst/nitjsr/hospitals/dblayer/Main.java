// 1. Create an interface named DBEntity inside a package inst.nitjsr.hospitals.dblayer. 
// The  interface contains abstract methods such as insert, delete, update. 
// The insert operation takes  a DBEntity type variable as parameter,
//  delete operation takes an integer as a parameter, and  update operation takes two parameters,
//   an integer and a DBEntity variable. Now, implement  this interface into three concrete classes
//    Doctor, Staff, Patient. In each implementation, for  now, just show a message such as
//     “from insert method of Doctor class” [You can guess the  possible strings for other 
//     method implementations in other concrete classes] 


// 2. Now add some properties to each of these classes, such as in Doctor class, you may add id, name, specialization, chamber_floor etc. (You may similarly place properties in other  concrete classes as it seems best suited from your viewpoint. Each class must have atleast  an id property). Create setter methods for these properties in the classes. Now in the  implemented interface methods, typecast the DBEntity parameter into that corresponding  concrete class, and change the message accordingly. As for example, the insert will print  “Inserting doctor with id: <> into database”, delete will print “Deleting doctor with id: <>  from database”, update will print “Modifying information of doctor with id: <> in database”. 

package inst.nitjsr.hospitals.dblayer;


interface DBEntity {
    void insert(DBEntity d1); 
    void delete(int id);       
    void update(int id, DBEntity d1); 
}


class Doctor implements DBEntity {
    int id;

    void setId(int id){
        this.id = id;
    }
    @Override
    public void insert(DBEntity d1) {
        Doctor d = (Doctor) d1; // typecasting DBEntity to doctor
        System.out.println("Inserting Doctor with id "+ d.id +" into database");
    }

    @Override
    public void delete(int id) {
        System.out.println("From delete method of Doctor class");
    }

    @Override
    public void update(int id, DBEntity d1) {
        System.out.println("From update method of Doctor class");
    }
}


class Staff implements DBEntity {
    int id;

    void setId(int id){
        this.id = id;
    }
    @Override
    public void insert(DBEntity d1) {
        System.out.println("From insert method of Staff class");
    }

    @Override
    public void delete(int id) {
        System.out.println("From delete method of Staff class");
    }

    @Override
    public void update(int id, DBEntity d1) {
        System.out.println("From update method of Staff class");
    }
}


class Patient implements DBEntity {
    int id;


    void setId(int id){
        this.id = id;
    }
    @Override
    public void insert(DBEntity d1) {
        System.out.println("From insert method of Patient class");
    }

    @Override
    public void delete(int id) {
        System.out.println("From delete method of Patient class");
    }

    @Override
    public void update(int id, DBEntity d1) {
        System.out.println("From update method of Patient class");
    }
}


public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.setId(101);
        d.insert(d);
        
      
    }
}



































// ques 1
// package inst.nitjsr.hospitals.dblayer;


// interface DBEntity {
//     void insert(DBEntity d1); 
//     void delete(int id);       
//     void update(int id, DBEntity d1); 
// }


// class Doctor implements DBEntity {
//     @Override
//     public void insert(DBEntity d1) {
//         System.out.println("From insert method of Doctor class");
//     }

//     @Override
//     public void delete(int id) {
//         System.out.println("From delete method of Doctor class");
//     }

//     @Override
//     public void update(int id, DBEntity d1) {
//         System.out.println("From update method of Doctor class");
//     }
// }


// class Staff implements DBEntity {
//     @Override
//     public void insert(DBEntity d1) {
//         System.out.println("From insert method of Staff class");
//     }

//     @Override
//     public void delete(int id) {
//         System.out.println("From delete method of Staff class");
//     }

//     @Override
//     public void update(int id, DBEntity d1) {
//         System.out.println("From update method of Staff class");
//     }
// }


// class Patient implements DBEntity {
//     @Override
//     public void insert(DBEntity d1) {
//         System.out.println("From insert method of Patient class");
//     }

//     @Override
//     public void delete(int id) {
//         System.out.println("From delete method of Patient class");
//     }

//     @Override
//     public void update(int id, DBEntity d1) {
//         System.out.println("From update method of Patient class");
//     }
// }


// public class Main {
//     public static void main(String[] args) {
        
      
//     }
// }

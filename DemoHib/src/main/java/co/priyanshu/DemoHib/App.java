package co.priyanshu.DemoHib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main (String[] args)
    {
    	/*Laptop laptop=new Laptop();
    	laptop.setLid(101);
    	laptop.setL_name("Dell");
    	
    	StudentName sname=new StudentName();
    	sname.setFname("ashwani");
    	sname.setMname("kumar");
    	sname.setLname("JHA");
    	
        student ash= new student();//null
        ash.setRoll_no(1);
        ash.setName(sname);
        ash.setCourse("MCA");
        ash.getLaptop().add(laptop);
        //laptop.setStu(ash); onetomany
        laptop.getStu().add(ash);*/
        Configuration cfg=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory factory=cfg.buildSessionFactory(reg);
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        //session.save(laptop);
        // session.save(ash);
       student ash=(student) session.get(student.class, 1);
        
        tx.commit();
        System.out.println(ash);
       
    }
}

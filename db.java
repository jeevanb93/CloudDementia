import java.util.Date;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;


DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();


Entity employee = new Entity("Employee");

employee.setProperty("firstName", "Antonio");
employee.setProperty("lastName", "Salieri");

Date hireDate = new Date();
employee.setProperty("hireDate", hireDate);

employee.setProperty("attendedHrTraining", true);


datastore.put(employee);

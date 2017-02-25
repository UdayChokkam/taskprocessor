import com.uday.taskprocessor.task.dao.TaskDao;
import com.uday.taskprocessor.task.model.Task;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static com.uday.taskprocessor.task.constants.Country.AUS;
import static com.uday.taskprocessor.task.constants.Country.ENG;
import static com.uday.taskprocessor.task.constants.Country.IND;
import static com.uday.taskprocessor.task.constants.OrderType.ORD;
import static com.uday.taskprocessor.task.constants.OrderType.PRE;
import static com.uday.taskprocessor.task.constants.TaskStatus.INPRG;

/**
 * Created by Udaykiran on 25/02/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/taskprocessor-test-context.xml"})
public class TaskProcessorTest {

    @Autowired
    private TaskDao taskDao;

    @Before
    public  void prepareTestData(){
        Task ausTask1 = new Task(101,1001, AUS, PRE,1, INPRG);
        Task ausTask2 = new Task(102,1002, AUS, ORD,2, INPRG);
        Task ausTask3 = new Task(103,1002, AUS, ORD,3, INPRG);
        Task ausTask4 = new Task(104,1002, AUS, ORD,4, INPRG);
        Task ausTask5 = new Task(105,1002, AUS, ORD,5, INPRG);

        Task engTask1 = new Task(101,1001, ENG, PRE,1, INPRG);
        Task engTask2 = new Task(102,1002, ENG, ORD,2, INPRG);
        Task engTask3 = new Task(103,1002, ENG, ORD,3, INPRG);
        Task engTask4 = new Task(104,1002, ENG, ORD,4, INPRG);
        Task engTask5 = new Task(105,1002, ENG, ORD,5, INPRG);

        Task indTask1 = new Task(101,1001, IND, PRE,1, INPRG);
        Task indTask2 = new Task(102,1002, IND, ORD,2, INPRG);
        Task indTask3 = new Task(103,1002, IND, ORD,3, INPRG);
        Task indTask4 = new Task(104,1002, IND, ORD,4, INPRG);
        Task indTask5 = new Task(105,1002, IND, ORD,5, INPRG);

        taskDao.setAusTasks(Arrays.asList(new Task[]{ausTask1,ausTask2,ausTask3,ausTask4,ausTask5}));
        taskDao.setEngTasks(Arrays.asList(new Task[]{engTask1,engTask2,engTask3,engTask4,engTask5}));
        taskDao.setIndTasks(Arrays.asList(new Task[]{indTask1,indTask2,indTask3,indTask4,indTask5}));
    }

    @Test
    public void test1(){

    }
}

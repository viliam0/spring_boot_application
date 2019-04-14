@Component
public class ScheduledTasks  {

    private Logger logger = Logger.getLogger(ScheduledTasks.class);

    @Value("${jobs.schedule.istime}")
    private boolean imagesPurgeJobEnable;

    @Override
    @Transactional(readOnly=true)
    @Scheduled(cron = "${jobs.schedule.istime}")
    public void execute() {

         //Do something
        //can use DAO or other autowired beans here
        if(imagesPurgeJobEnable){

           // Do your conditional job here...

        }
   }
}

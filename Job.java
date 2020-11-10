/* Creates a new Job */

public class Job 
{
	private int jobID;
	private int duration;
	
	public Job()
	{
	}
	
	public Job(int jobID, int duration)
	{
		this.jobID = jobID;
		this.duration = duration;
	}
	public setJobID (int jobID)
	{
		this.jobID = jobID;
	}
	public int getJobID()
	{
		return jobID;
	}	
	public setDuration (int duration)
	{
		this.duration = duration;
	}
	public int duration()
	{
		return duration;
	}	
	
	
}
	
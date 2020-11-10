/*Creates a new client */

public class Client 
{
	private int clientID;
	private Job aJob; 
	
	public Client (int clientID, Job aJob)
	{
		clientID = aClientID;
		aJob = new Job();
	}
}

/* needs methods. I tried my best to kinda follow what he did on the bank account
it uses the file writing in the code so we should try that instead of doing it in the JFrame
same goes for the owner class. The only class I think we're missing is the VC class which should probably have 2 queues, one for jobs and one for cars


package ganavi.Dlithe;

	public interface Assemblyworks 
	{

		public void createNewRecord(Assembly object);
		public String toString();
		public Assembly readOne(Integer number);
		public String delete(Integer number);
		public void update(Integer number);
	}

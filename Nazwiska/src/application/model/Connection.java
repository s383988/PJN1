package application.model;

public class Connection {
	
	private String topic;
	
	public Lastname connect(String name, String [] suffixes, String type){
		Topic t = new Topic();
		topic = t.findTopic(name, type);
		
		Lastname l = new Lastname();
		if(suffixes!=null){
			l.setMianownik(topic+suffixes[2]);
			l.setDopelniacz(topic+suffixes[3]);
			l.setCelownik(topic+suffixes[4]);
			l.setBiernik(topic+suffixes[5]);
			l.setNarzednik("z "+topic+suffixes[6]);
			l.setMiejscownik("o "+topic+suffixes[7]);
			l.setWolacz(topic+suffixes[8]);
		}
		else
		{
			l.setMianownik(name);
			l.setDopelniacz("Brak wzorca odmiany");
			l.setCelownik("Brak wzorca odmiany");
			l.setBiernik("Brak wzorca odmiany");
			l.setNarzednik("Brak wzorca odmiany");
			l.setMiejscownik("Brak wzorca odmiany");
			l.setWolacz("Brak wzorca odmiany");
		}
		
		return l;
		
	}

}

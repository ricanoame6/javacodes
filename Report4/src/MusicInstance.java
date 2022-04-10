public class MusicInstance 
{
    public static void main(String[] args) 
    {
    	Music[] musics = new Music[3];
    	Music m = new Music("�����", 1700);
    	Classic c = new Classic("ĳ��", 1732, "���ۺ�");
    	Pop p = new Pop("�ٶ��� �д�", 2004, "�̼Ҷ�");
    	System.out.println(m);
    	System.out.println(c);
    	System.out.println(p);
     
    	musics[0] = m; musics[1] = c; musics[2] = p;
    	
		for(int i = 0; i<3; i++) 
   		{
			Music currentMusic = musics[i];
   			if (currentMusic instanceof Classic) { musics[i] = (Classic)musics[i]; }
  			else if (currentMusic instanceof Pop) { musics[i] = (Pop)musics[i];}
   			else if (currentMusic instanceof Music) {continue;}		
 		}
		for(int j = 0; j < musics.length; j++)
		{
			if(musics[j]  instanceof Classic)
				System.out.println("Classic");
			else if(musics[j]  instanceof Pop)
				System.out.println("Pop");
			else
				System.out.println("Music");
		}
    }
}

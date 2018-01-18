public class Song{

	private String title;
	private Singer singer;
	private String url;



public Song(String title1, Singer singer1, String url1) {
	title=title1;
	singer=singer1;
	url=url1;
}

public String getTitle(){
	return title;
	}
public void setTitle(String title){
	this.title=title;
	}

public Singer getSinger(){
	return singer;
	}

public void setSinger(Singer singer){
	this.singer=singer;
	}

public String getUrl(){
	return url;
	}

public void setUrl(String url){
	this.url=url;
	}

public String toString(){
	return "Singer[title=" +title+ ", singer=" +singer+ " url=" +url+ "]";
	}

}
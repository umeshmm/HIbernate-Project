package beans;

import java.util.Set;

public class Actor {

private int aid;
private String actorname;
private Set<Movies> movies;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getActorname() {
	return actorname;
}
public void setActorname(String actorname) {
	this.actorname = actorname;
}
public Set<Movies> getMovies() {
	return movies;
}
public void setMovies(Set<Movies> movies) {
	this.movies = movies;
}







}

package usantatecla.movies.v24;

public class MovieBuilder {

	private String title;
	private Class<? extends Movie> movieClass;

	public MovieBuilder() {
		this.title = "movieName";
		this.movieClass = RegularMovie.class;
	}

	public MovieBuilder title(String title) {
		this.title = title;
		return this;
	}

	public MovieBuilder childrens() {
		this.movieClass = ChildrenMovie.class;
		return this;
	}

	public MovieBuilder regular() {
		this.movieClass = RegularMovie.class;
		return this;
	}

	public MovieBuilder newRelease() {
		this.movieClass = NewReleaseMovie.class;
		return this;
	}

	public Movie build() {
		try {
			return movieClass.getConstructor(String.class).newInstance(title);
		} catch (Exception e) {
			throw new RuntimeException("Could not instantiate movie", e);
		}
	}
}

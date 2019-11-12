package com.revature.models;

public class OS {
	private int id;
	private String version;
	private String name;
	private String developer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set id");
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		System.out.println("Set version");
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set name: " + name);
		this.name = name;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		System.out.println("Set developer");
		this.developer = developer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OS other = (OS) obj;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OS [id=" + id + ", version=" + version + ", name=" + name + ", developer=" + developer + "]";
	}

	public OS(int id, String version, String name, String developer) {
		System.out.println("Args constructor for OS");
		this.id = id;
		this.version = version;
		this.name = name;
		this.developer = developer;
	}

	public OS() {
		System.out.println("No args constructor for OS");
	}
}

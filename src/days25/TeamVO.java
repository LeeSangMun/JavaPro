package days25;

import java.util.Objects;

public class TeamVO {
	private String name;
	private int totalNumber;
	private String leader;

	public TeamVO() {
		super();
	}

	public TeamVO(String name, int totalNumber, String leader) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leader = leader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	@Override
	public String toString() {
		return "TeamVO [name=" + name + ", totalNumber=" + totalNumber + ", leader=" + leader + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamVO other = (TeamVO) obj;
		return Objects.equals(name, other.name);
	}
	
	
}

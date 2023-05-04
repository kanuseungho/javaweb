package member;

public class MemberVO {
	private int idx;
	private String mid;
	private String pwd;
	private String nickName;
	private String name;
	private String gender;
	private String birthday;
	private String tel;
	private String address;
	private String email ;
	private String homePage ;
	private String job;
	private String hobby;
	private String photo;
	private String content ;
	private String userInfor;
	private String userDel;
	private int point;
	private int level;
	private int visitCnt ;
	private String startDate;
	private String lastDate;
	private int todayCnt;
	protected int getIdx() {
		return idx;
	}
	protected void setIdx(int idx) {
		this.idx = idx;
	}
	protected String getMid() {
		return mid;
	}
	protected void setMid(String mid) {
		this.mid = mid;
	}
	protected String getPwd() {
		return pwd;
	}
	protected void setPwd(String pwd) {
		this.pwd = pwd;
	}
	protected String getNickName() {
		return nickName;
	}
	protected void setNickName(String nickName) {
		this.nickName = nickName;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
	protected String getBirthday() {
		return birthday;
	}
	protected void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	protected String getTel() {
		return tel;
	}
	protected void setTel(String tel) {
		this.tel = tel;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getHomePage() {
		return homePage;
	}
	protected void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	protected String getJob() {
		return job;
	}
	protected void setJob(String job) {
		this.job = job;
	}
	protected String getHobby() {
		return hobby;
	}
	protected void setHobby(String hobby) {
		this.hobby = hobby;
	}
	protected String getPhoto() {
		return photo;
	}
	protected void setPhoto(String photo) {
		this.photo = photo;
	}
	protected String getContent() {
		return content;
	}
	protected void setContent(String content) {
		this.content = content;
	}
	protected String getUserInfor() {
		return userInfor;
	}
	protected void setUserInfor(String userInfor) {
		this.userInfor = userInfor;
	}
	protected String getUserDel() {
		return userDel;
	}
	protected void setUserDel(String userDel) {
		this.userDel = userDel;
	}
	protected int getPoint() {
		return point;
	}
	protected void setPoint(int point) {
		this.point = point;
	}
	protected int getLevel() {
		return level;
	}
	protected void setLevel(int level) {
		this.level = level;
	}
	protected int getVisitCnt() {
		return visitCnt;
	}
	protected void setVisitCnt(int visitCnt) {
		this.visitCnt = visitCnt;
	}
	protected String getStartDate() {
		return startDate;
	}
	protected void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	protected String getLastDate() {
		return lastDate;
	}
	protected void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	protected int getTodayCnt() {
		return todayCnt;
	}
	protected void setTodayCnt(int todayCnt) {
		this.todayCnt = todayCnt;
	}
	@Override
	public String toString() {
		return "MemberVO [idx=" + idx + ", mid=" + mid + ", pwd=" + pwd + ", nickName=" + nickName + ", name=" + name
				+ ", gender=" + gender + ", birthday=" + birthday + ", tel=" + tel + ", address=" + address + ", email=" + email
				+ ", homePage=" + homePage + ", job=" + job + ", hobby=" + hobby + ", photo=" + photo + ", content=" + content
				+ ", userInfor=" + userInfor + ", userDel=" + userDel + ", point=" + point + ", level=" + level + ", visitCnt="
				+ visitCnt + ", startDate=" + startDate + ", lastDate=" + lastDate + ", todayCnt=" + todayCnt + "]";
	}
	
}

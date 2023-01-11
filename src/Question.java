public class Question {
  String questionContent;
  String postedBy;
  boolean isAnswered = false;
  String questionTitle;
  String response;
  String answeredBy;

  public Question(String questionContent, String postedBy, String questionTitle) {
    this.questionContent = questionContent;
    this.postedBy = postedBy;
    this.questionTitle = questionTitle;
  }

  public void answerQuestion(String response, String answeredBy) {
    this.answeredBy = answeredBy;
    this.response = response;
    this.isAnswered = true;
  }
}

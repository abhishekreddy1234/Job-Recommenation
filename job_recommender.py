# job_recommender.py

from job_data import jobs, User

class JobRecommender:
    def _init_(self, user):
        self.user = user

    def recommend_jobs(self):
        recommended = []
        for job in jobs:
            if self.user.skills.intersection(job.skills_required):
                recommended.append(job.title)
        return recommended

# Example Usage (For Testing)
if _name_ == "_main_":
    user = User("Alice", {"Python", "Flask"})
    recommender = JobRecommender(user)
    print("Recommended Jobs:", recommender.recommend_jobs())
# job_data.py

class Job:
    def _init_(self, title, skills_required):
        self.title = title
        self.skills_required = skills_required

class User:
    def _init_(self, name, skills):
        self.name = name
        self.skills = skills

# Sample Job Dataset
jobs = [
    Job("Software Engineer", {"Python", "Django", "Flask"}),
    Job("Data Scientist", {"Python", "Machine Learning", "Pandas"}),
    Job("Frontend Developer", {"HTML", "CSS", "JavaScript"}),
    Job("Backend Developer", {"Python", "Node.js", "SQL"}),
]
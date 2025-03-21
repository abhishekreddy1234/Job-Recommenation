<!DOCTYPE html>
<html>
<head>
    <title>Job Recommendation System</title>
</head>
<body>
    <h2>Enter Your Skills</h2>
    <form method="post">
        Name: <input type="text" name="name" required><br>
        Skills (comma-separated): <input type="text" name="skills" required><br>
        <button type="submit">Get Job Recommendations</button>
    </form>

    {% if recommended_jobs %}
        <h3>Recommended Jobs for You:</h3>
        <ul>
            {% for job in recommended_jobs %}
                <li>{{ job }}</li>
            {% endfor %}
        </ul>
    {% endif %}
</body>
</html>
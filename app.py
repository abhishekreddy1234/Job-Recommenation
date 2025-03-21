# Install dependencies (Only needed in Colab)
!pip install flask pyngrok

# Run Flask App & Expose with Ngrok
from flask import Flask
from pyngrok import ngrok

app = Flask(_name_)

# Start Ngrok tunnel
ngrok.set_auth_token("YOUR_NGROK_AUTH_TOKEN")  # Replace with your Ngrok token
public_url = ngrok.connect(5000).public_url
print(f"Public URL: {public_url}")

# Run Flask
app.run()
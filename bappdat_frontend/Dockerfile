# Base image
FROM node:18

# Create app directory
WORKDIR /app

# Install dependencies
COPY package*.json ./
RUN npm install

# Add source files
COPY . .

# Expose the port
EXPOSE 3000

# Start the dev server
CMD ["npm", "start"]

# FROM baseImage
FROM node

# set the working directory
# all the commands will be executed inside app directory
WORKDIR /app

# COPY . .
# first dot represent source - means all folders and files will be copied
# second dot - destination - means tha path where those files will be stored/pasted

COPY . /app
# COPY all files and paste inside app folder

# COPY a particular file and paste in app folder
# COPY package.json /app

# this command will install packages from package.json
RUN npm install

# EXPORT port
EXPOSE 3000

# runs the container
CMD ["node", "app.js"]
# fetch node.js image from docker hub
FROM node:18.6

WORKDIR /app

# COPY . .
# first dot represent - source - copy all files from current location
# second dot represent - destination - paste all files in app directory

# COPY package.json /app/
# COPY server.js /app/

COPY . /app/

RUN npm install

EXPOSE 3000

# CMD ["node", "server.js"]
# CMD ["npm", "start"]
CMD ["npm", "run", "dev"]
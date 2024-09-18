const express = require("express");
const app = express();
const mongoose = require("mongoose");

const taskRoutes = require("./routes/taskRoutes");

const {MONGO_USER, MONGO_PASSWORD, MONGO_IP, MONGO_PORT} = require("./config/config");
const MONGO_URL = `mongodb://${MONGO_USER}:${MONGO_PASSWORD}@${MONGO_IP}:${MONGO_PORT}/?authSource=admin`;

mongoose.connect(
    // "mongodb://root:root@172.30.0.2:27017/?authSource=admin")
    // "mongodb://root:root@mongo:27017/?authSource=admin")
    MONGO_URL)
    .then(() => {
        console.log("Successfully connected to MongoDB");
    })
    .catch((e) => {
        console.log("Error :",e);
    });


app.use(express.json());    // to handle JSON

app.get("/", (req, res) => {
    res.send("<h1>Hello World using Docker and Express</h1>");
});


app.use("/api/v1/tasks", taskRoutes);
// app.use("/api/v1/users", userRoutes);


const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log("Listening on PORT :",PORT);
});
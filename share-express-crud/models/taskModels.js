// Task Schema
const mongoose = require("mongoose");

const taskSchema = mongoose.Schema({
    taskTitle: {
        type: String,
        required: [true, "Please mention task title"]
    },
    taskDesc: {
        type: String,
        required: [true, "Please mention task description"]
    },

});

const Task = mongoose.model("Task", taskSchema);
module.exports = Task;
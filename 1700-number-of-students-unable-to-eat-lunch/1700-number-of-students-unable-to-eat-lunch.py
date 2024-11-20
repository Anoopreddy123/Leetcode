from collections import deque

class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        size = len(students)
        student = deque()
        sandwich = deque()
        i, j = 0, 0
        for a in students:
            student.append(a)
            
        for b in sandwiches:
            sandwich.append(b)
            
        while i < len(student):
            if student[0] == sandwich[j]:
                student.popleft()
                # sandwich.popleft()
                print('student' , student)
                print('size', len(student))
                print('sandwich' , sandwich)
                print('size', len(sandwich))
                i= 0
                j = j + 1
                

            else:
                student.append(student.popleft())
                #sandwich.append(sandwich.popleft())
                i+=1
            
                
        return len(student)
        
            
        
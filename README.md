<h1 align="center">
Camunda Demo</h1>



## 🧐 Description <a name = "description"></a>
Cette démonstration a pour but de montrer ma compréhension de Camunda. Il s'agit du processus lorsqu'un employé souhaite partir. Il envoie une demande au serveur, puis obtient l'approbation de son manager et ensuite celle des ressources humaines (RH). Enfin, son départ est mis à jour dans le système pour indiquer qu'il peut partir. Pour cela, un schéma a été réalisé comprenant deux tâches système : l'une montrant que l'employé souhaite partir, une tâche utilisateur où la demande doit être approuvée par le manager via un formulaire, puis par les RH, et enfin une tâche système indiquant qu'il peut partir maintenant. Nous pouvons également insérer des variables pour travailler avec notre système.
## 🎯 Project Goals <a name = "project-goals"></a>
Les objectifs principaux du projet incluent : la création et le déploiement d'un modèle de processus, la liaison du schéma de processus avec le système backend et la manipulation des données selon les besoins.

## 📝 Schema <a name = "schema"></a>
<p align="center">
  <img src="src/main/java/com/example/demo/Assets/Shcema.png" alt="Schema">
</p>

Ce schéma a été réalisé avec Camunda Modeler. Il contient 2 tâches utilisateur et 2 tâches système, ainsi qu'un début et une fin. Les tâches utilisateur comportent un formulaire pour vérifier l'approbation

## 📝 Camunda cockpit <a name = "cockpit"></a>
<p align="center">
  <img src="src/main/java/com/example/demo/Assets/Cockpit.png" alt="cockpit">
</p>

Camunda cockpit est pour la surveillance et les opérations. Il permet d'accéder aux processus BPMN déployés et aux décisions DMN, et permet de rechercher parmi les instances en cours et terminées.

## 📝 Camunda Tasklist <a name = "tasklist"></a>
<p align="center">
  <img src="src/main/java/com/example/demo/Assets/Camunda Tasklist.png" alt="tasklist">
</p>

Camunda Tasklist nous permet de travailler sur les tâches utilisateur et de les filtrer.

## 📝 User Task <a name = "usertask"></a>
<p align="center">
  <img src="src/main/java/com/example/demo/Assets/UserTasks.png" alt="usertask">
</p>

User task est utilisée pour modéliser le travail qui doit être effectué par un acteur humain

## 🛠️ Execution <a name = "Execution"></a>
<p align="center">
  <img src="src/main/java/com/example/demo/Assets/Execution.png" alt="Execution">
</p>

🚀 Installation <a name="installation"></a>

   - Clonez le dépôt.
   - Ouvrez le projet dans IntelliJ IDEA.
   - Utilisez les identifiants username:admin , password:admin
   - Exécutez la commande Mvn clean install
   - Exécutez l'application.
   - Accédez à Camunda tableau de bord à l'adresse http://localhost:8080.

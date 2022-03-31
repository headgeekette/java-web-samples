FROM tomcat:9.0.59-jdk11-openjdk-buster
# FROM tomcat:10.0.18-jdk11-openjdk-bullseye

RUN apt-get update && apt-get install -y --no-install-recommends \ 
    git \
    maven \
    sudo \
    graphviz \
    && rm -rf /var/lib/apt/lists/*

ARG USERNAME=work
ARG USER_UID=1000
ARG USER_GID=$USER_UID

ENV JAVA_HOME /usr/local/openjdk-11

# Create the user
RUN groupadd --gid $USER_GID $USERNAME \
    && useradd --uid $USER_UID --gid $USER_GID -m $USERNAME \
    #
    # [Optional] Add sudo support. Omit if you don't need to install software after connecting.
    && echo $USERNAME ALL=\(root\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME \
    && chmod 0440 /etc/sudoers.d/$USERNAME

# ********************************************************
# * Anything else you want to do like clean up goes here *
# ********************************************************

# [Optional] Set the default user. Omit if you want to keep the default as root.
USER $USERNAME
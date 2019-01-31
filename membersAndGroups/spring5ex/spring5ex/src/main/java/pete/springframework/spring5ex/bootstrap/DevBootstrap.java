package pete.springframework.spring5ex.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pete.springframework.spring5ex.Model.Group;
import pete.springframework.spring5ex.Model.Member;
import pete.springframework.spring5ex.repositories.GroupRepository;
import pete.springframework.spring5ex.repositories.MemberRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private GroupRepository groupRepository;
    private MemberRepository memberRepository;

    public DevBootstrap(GroupRepository groupRepository, MemberRepository memberRepository) {
        this.groupRepository = groupRepository;
        this.memberRepository = memberRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Rock 'N'Roll
        Group rock = new Group("ILoveRock", "Music", true);
        Member slash = new Member("Saul", "Hudson", 53);
        //rock.getMembers().add(slash);
        slash.getGroups().add(rock);

//        groupRepository.save(rock);
//        memberRepository.save(slash);


        //Way of the peaceful Warrior
        Group peacefulWarriors = new Group("Way of the peaceful warrior", "Movie/Book", false);
        Member danMillman = new Member("Dan", "Millman", 60);
        peacefulWarriors.getMembers().add(danMillman);

//        groupRepository.save(peacefulWarriors);
//        memberRepository.save(danMillman);
//
    }



}
